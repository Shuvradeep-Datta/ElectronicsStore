package com.deep.electronic.store.services;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
@Service
public interface FileService {
	
	String uploadFile(MultipartFile file,String path) throws IOException;
	
	InputStream getResource(String path,String name) throws FileNotFoundException;

}
