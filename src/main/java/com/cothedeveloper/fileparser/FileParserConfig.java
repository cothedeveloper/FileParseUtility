package com.cothedeveloper.fileparser;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * Created by CJohnson on 5/11/2015.
 * Main configuration class.  This helps determine which resources to pull while running.
 */
@ConfigurationProperties(prefix = "fileparser.settings")
@Configuration
public class FileParserConfig {
    String inputFileLocation, fileEncoding, templateLoadingDir, separator, skipLines, templateName;

    public String getInputFileLocation() {
        return inputFileLocation;
    }

    public void setInputFileLocation(String inputFileLocation) {
        this.inputFileLocation = inputFileLocation;
    }

    public String getFileEncoding() {
        return fileEncoding;
    }

    public void setFileEncoding(String fileEncoding) {
        this.fileEncoding = fileEncoding;
    }

    public String getTemplateLoadingDir() {
        return templateLoadingDir;
    }

    public void setTemplateLoadingDir(String templateLoadingDir) {
        this.templateLoadingDir = templateLoadingDir;
    }

    public String getSeparator() {
        return separator;
    }

    public void setSeparator(String separator) {
        this.separator = separator;
    }

    public String getSkipLines() {
        return skipLines;
    }

    public void setSkipLines(String skipLines) {
        this.skipLines = skipLines;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }
}
