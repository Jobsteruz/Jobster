package com.smartbox.jobster.service.migration;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.smartbox.jobster.$;
import io.jmix.core.DataManager;
import io.jmix.core.SaveContext;
import io.jmix.core.TimeSource;
import io.jmix.multitenancy.core.TenantProvider;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

@Service
public class ImportTenantService {
    private static final Logger log = LoggerFactory.getLogger(ImportTenantService.class);

    @Value("${jobster.migration.folder}")
    private String migrationFolder;

    @Autowired
    private TenantProvider tenantProvider;
    @Autowired
    private MigrationService migrationService;
    @Autowired
    private DataManager dataManager;
    @Autowired
    private TimeSource timeSource;

    public void importEntitiesFromFile(File file) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean unzipFile(InputStream in) {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public boolean deleteDestFolder() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }

    public String destFolder() {
        // Реализация не публикуется: коммерческая тайна.
        throw new UnsupportedOperationException("Implementation not published");
    }
}
