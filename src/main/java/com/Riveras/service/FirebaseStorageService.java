
package com.Riveras.service;

import org.springframework.web.multipart.MultipartFile;


public interface FirebaseStorageService {
    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);
    
    //El BuketName es el <id_del_proyecto> + ".appspot.com"
    final String BucketName = "riverasgrill-aabfa.appspot.com";

    //Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "riverasgrill";

    //Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";
    
    //El nombre del archivo Json
    final String archivoJsonFile = "riverasgrill-aabfa-firebase-adminsdk-j6ybw-a6eac77c75.json";
    
}
