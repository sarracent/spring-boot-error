package com.sarracent.springboot.error.app.controllers;

import com.sarracent.springboot.error.app.errors.UsuarioNoEncontradoException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Date;

@ControllerAdvice
public class ErrorHandlerController {
    @ExceptionHandler(ArithmeticException.class)
    public String aritmeticaError(ArithmeticException e, Model model) {
        model.addAttribute("error", "Error de aritmetica");
        model.addAttribute("message", e.getMessage());
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        model.addAttribute("timestamp", new Date());
        return "error/generica";
    }

    @ExceptionHandler(NumberFormatException.class)
    public String numeroFormatoError(Exception e, Model model) {
        model.addAttribute("error", "Error: Formato número inválido!");
        model.addAttribute("message", e.getMessage());
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        model.addAttribute("timestamp", new Date());
        return "error/generica";
    }

    @ExceptionHandler(UsuarioNoEncontradoException.class)
    public String UsuarioNoEncontrado(UsuarioNoEncontradoException e, Model model) {
        model.addAttribute("error", "Error: Usuario no encontrado!");
        model.addAttribute("message", e.getMessage());
        model.addAttribute("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
        model.addAttribute("timestamp", new Date());
        return "error/usuario";
    }
}
