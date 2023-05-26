package com.api.controllers;

import jakarta.annotation.Resource;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RequestMapping("/reportes/")
public class Reportes {
    @GetMapping("/descargar-excel")
    public ResponseEntity<Resource> descargarExcel() throws IOException {
        // Leer el archivo Excel desde la ubicación de almacenamiento
        File excelFile = new File("ruta/al/archivo.xlsx");
        InputStreamResource resource = new InputStreamResource(new FileInputStream(excelFile));

        // Configurar la respuesta HTTP para la descarga del archivo
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" + excelFile.getName())
                .contentType(MediaType.parseMediaType("application/vnd.ms-excel"))
                .contentLength(excelFile.length())
                .body((Resource) resource);
    }

}
