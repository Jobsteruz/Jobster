package com.smartbox.jobster.service;

import com.smartbox.jobster.entity.core.DocumentType;
import com.smartbox.jobster.entity.core.PersonDocument;
import io.jmix.core.DataManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author Jobster team
 * Since: 4/14/2024 3:25 PM
 */
@Service
public class DocumentService {

    @Autowired
    private DataManager dataManager;

    public List<PersonDocument> getPersonDocuments(String personEntity, UUID personId) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public List<PersonDocument> getPersonDocumentsByType(String personEntity, UUID personId, DocumentType type) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
