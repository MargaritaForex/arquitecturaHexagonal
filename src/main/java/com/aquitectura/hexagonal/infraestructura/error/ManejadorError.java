package com.aquitectura.hexagonal.infraestructura.error;

import com.aquitectura.hexagonal.dominio.excepcion.GarantiaExtendidaException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.concurrent.ConcurrentHashMap;

@ControllerAdvice
public class ManejadorError extends ResponseEntityExceptionHandler {

    private static final String OCURRIO_UN_ERROR_FAVOR_CONTACTAR_AL_ADMINISTRADOR = "Ocurrió un error favor contactar al administrador.";
    public static final String EL_PRODUCTO_TIENE_GARANTIA = "El producto ya cuenta con una garantía extendida";

    private static final ConcurrentHashMap<String, Integer> CODIGOS_ESTADO = new ConcurrentHashMap<>();

    public ManejadorError() {
        CODIGOS_ESTADO.put(GarantiaExtendidaException.class.getSimpleName(), HttpStatus.NOT_MODIFIED.value());
        CODIGOS_ESTADO.put(GarantiaExtendidaException.class.getSimpleName(), HttpStatus.BAD_REQUEST.value());
        //en caso de tener otra excepcion matricularla aca
    }

    @ExceptionHandler(Exception.class)
    public final ResponseEntity<Error> handleAllExceptions(Exception exception) {
        ResponseEntity<Error> resultado;

        String excepcionNombre = exception.getClass().getSimpleName();
        String mensaje = exception.getMessage();
        Integer codigo = CODIGOS_ESTADO.get(excepcionNombre);

        if (codigo != null) {
            if(codigo == HttpStatus.NOT_MODIFIED.value()){
                Error error = new Error(excepcionNombre, EL_PRODUCTO_TIENE_GARANTIA);
                resultado = new ResponseEntity<>(error, HttpStatus.NOT_MODIFIED);
            }else{
                Error error = new Error(excepcionNombre, mensaje);
                resultado = new ResponseEntity<>(error, HttpStatus.valueOf(codigo));
            }
        } else {
            Error error = new Error(excepcionNombre, OCURRIO_UN_ERROR_FAVOR_CONTACTAR_AL_ADMINISTRADOR);
            resultado = new ResponseEntity<>(error, HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return resultado;
    }
}
