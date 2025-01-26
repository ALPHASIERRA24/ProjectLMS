package com.cts.LibraryManagementSystem.service;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.LibraryManagementSystem.dto.CatalogDTO;
import com.cts.LibraryManagementSystem.model.CatalogModel;
import com.cts.LibraryManagementSystem.repository.CatalogRepository;

@Service
public class CatalogServiceImpl implements CatalogService {
	
	@Autowired
	private CatalogRepository catalogRepo;

	@Override
	public List<CatalogModel> getAllBooks() {
		return catalogRepo.findAll();
	}

	@Override
	public CatalogModel addBook(CatalogDTO addCatalogDTO) {
		
		CatalogModel catalogModel = CatalogModel.builder()
				.bookName(addCatalogDTO.getBookName())
				.bookAuthor(addCatalogDTO.getBookAuthor())
				.bookGenre(addCatalogDTO.getBookGenre())
				.availabilityStatus(addCatalogDTO.isAvailabilityStatus())
				.createdAt(new Timestamp(new Date(System.currentTimeMillis()).getTime()))
				.updatedAt(new Timestamp(new Date(System.currentTimeMillis()).getTime()))
				.build();
		
		return catalogRepo.save(catalogModel);
	}

	@Override
	public boolean deleteBookById(Integer bookId) {
	       if (!catalogRepo.existsById(bookId)) {
	            return false;
	        }
	        catalogRepo.deleteById(bookId);
	        return true;
	}

	@Override
	public CatalogModel getBookById(int bookId) {
		return catalogRepo.findById(bookId);	
	}

	@Override
	public void getBookByName(String bookName) {
		catalogRepo.findByBookName(bookName);
	}

	@Override
	public List<CatalogModel> getBooksByGenre(String bookGenre) {
		return catalogRepo.findByBookGenre(bookGenre);
	}

  Update
	// @Override
	// public CatalogModel updateBookById(int bookId, CatalogDTO catalogDTO) {
	// 	CatalogModel catalogModel=catalogRepo.findById(bookId);
		
	// 	catalogModel.builder().bookName(catalogDTO.getBookName() !=null ? catalogDTO.getBookName() : catalogModel.getBookName())
	// 	.bookAuthor(catalogDTO.getBookAuthor() !=null ? catalogDTO.getBookAuthor() : catalogModel.getBookName())
	// 	.bookGenre(catalogDTO.getBookGenre() !=null? catalogDTO.getBookGenre() : catalogModel.getBookGenre())
	// 	//.availabilityStatus //dought
	// 	//.createdAt(catalogModel.setCreatedAt(null))
	// 	.updatedAt(new Timestamp(new Date(System.currentTimeMillis()).getTime()))
	// 	.build();
	// 	return catalogRepo.save(catalogModel);
	}
	
}
