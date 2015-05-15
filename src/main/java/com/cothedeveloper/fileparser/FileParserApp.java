package com.cothedeveloper.fileparser;

import au.com.bytecode.opencsv.CSV;
import au.com.bytecode.opencsv.CSVReadProc;
import freemarker.template.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.*;

/**
 * Created by CJohnson on 5/11/2015.
 */
@org.springframework.context.annotation.Configuration
@EnableAutoConfiguration
@EnableConfigurationProperties(FileParserConfig.class)
@Import(FilePositionModel.class)
public class FileParserApp {
    private static CSV csv;
    final static Logger logger = LoggerFactory.getLogger(FileParserApp.class);
    static Map<String, Object> mInput = new HashMap<String, Object>();
    // 1. Configure FreeMarker
    static Configuration mCfg = new Configuration();
    static String mFileName, mFileEncode, mSkipLines, mTemplateName;
    private static List<String> mrowArrayx;

    public static void main(String[] args) {
        // Launch the application
        ConfigurableApplicationContext context = SpringApplication.run(FileParserApp.class, args);

        //Get the configuration beans before running process.
        final FileParserConfig fileParserConfig = context.getBean(FileParserConfig.class);
        final FilePositionModel filePositionModel = context.getBean(FilePositionModel.class);
        //char separator1=fileParserConfig.getSeparator().charAt(0);
      //  logger.info("Separator1  "+separator1);
        char separator=',';
        try {
            separator = fileParserConfig.getSeparator().charAt(0);
        }catch (Exception e){
            logger.error("FileParserApp Exception trying get separator.  Using default delimiter. Comma. ",e);

        }
        //setup the CSV Reader
        csv = CSV
                .separator(separator)
                .quote('\"')
                .skipLines(Integer.parseInt(fileParserConfig.getSkipLines()))
                .charset(fileParserConfig.getFileEncoding())
                .create();
        try {
            // Where do we load the templates from:
            mCfg.setDirectoryForTemplateLoading(new File(fileParserConfig.getTemplateLoadingDir()));
        } catch (IOException e) {
            logger.error("FreeMarker : Unable to Load Template", e);
        }

        // Some other settings change to preference:
        mCfg.setIncompatibleImprovements(new Version(2, 3, 20));
        mCfg.setDefaultEncoding(fileParserConfig.getFileEncoding());
        mCfg.setLocale(Locale.US);
        mCfg.setTemplateExceptionHandler(TemplateExceptionHandler.RETHROW_HANDLER);

        //Set General Properties
        mFileName = fileParserConfig.getInputFileLocation();
        mFileEncode = fileParserConfig.getFileEncoding();
        mSkipLines = fileParserConfig.getSkipLines();
        mTemplateName=fileParserConfig.getTemplateName();
        //end of setting Properties

        csv.read(mFileName, new CSVReadProc() {
            String var0,var1,var2,var3,var4,var5,var6,var7,var8,var9,var10,var11,var12,var13,var14,var15,var16,var17,var18,var19,var20;

            @Override
            public void procRow(int rowIndex, String... values) {
                logger.info("Current Row : " +rowIndex);
                mrowArrayx = Arrays.asList(values);




                for(int x =0; x <= mrowArrayx.size()-1;x++) {
                    switch (x){
                        case 0:
                            var0=mrowArrayx.get(FileParserConstants.POSITION);
                            mInput.put(filePositionModel.getVar(),var0);
                            break;
                        case 1:
                            var1=mrowArrayx.get(FileParserConstants.POSITION1);
                            mInput.put(filePositionModel.getVar1(),var1);
                            break;
                        case 2:
                            var2=mrowArrayx.get(FileParserConstants.POSITION2);
                            mInput.put(filePositionModel.getVar2(),var2);
                            break;
                        case 3:
                            var3=mrowArrayx.get(FileParserConstants.POSITION3);
                            mInput.put(filePositionModel.getVar3(),var3);
                            break;
                        case 4:
                            var4=mrowArrayx.get(FileParserConstants.POSITION4);
                            mInput.put(filePositionModel.getVar4(),var4);
                            break;
                        case 5:
                            var5=mrowArrayx.get(FileParserConstants.POSITION5);
                            mInput.put(filePositionModel.getVar5(),var5);
                            break;
                        case 6:
                            var6=mrowArrayx.get(FileParserConstants.POSITION6);
                            mInput.put(filePositionModel.getVar6(),var6);
                            break;
                        case 7:
                            var7=mrowArrayx.get(FileParserConstants.POSITION7);
                            mInput.put(filePositionModel.getVar7(),var7);
                            break;
                        case 8:
                            var8=mrowArrayx.get(FileParserConstants.POSITION8);
                            mInput.put(filePositionModel.getVar8(),var8);
                            break;
                        case 9:
                            var9=mrowArrayx.get(FileParserConstants.POSITION9);
                            mInput.put(filePositionModel.getVar9(),var9);
                            break;
                        case 10:
                            var10=mrowArrayx.get(FileParserConstants.POSITION10);
                            mInput.put(filePositionModel.getVar10(),var10);
                            break;
                        case 11:
                            var11=mrowArrayx.get(FileParserConstants.POSITION11);
                            mInput.put(filePositionModel.getVar11(),var11);
                            break;
                        case 12:
                            var12=mrowArrayx.get(FileParserConstants.POSITION12);
                            mInput.put(filePositionModel.getVar12(),var12);
                            break;
                        case 13:
                            var13=mrowArrayx.get(FileParserConstants.POSITION13);
                            mInput.put(filePositionModel.getVar13(),var13);
                            break;
                        case 14:
                            var14=mrowArrayx.get(FileParserConstants.POSITION14);
                            mInput.put(filePositionModel.getVar14(),var14);
                            break;
                        case 15:
                            var15=mrowArrayx.get(FileParserConstants.POSITION15);
                            mInput.put(filePositionModel.getVar15(),var15);
                            break;
                        case 16:
                            var16=mrowArrayx.get(FileParserConstants.POSITION16);
                            mInput.put(filePositionModel.getVar16(),var16);
                            break;
                        case 17:
                            var17=mrowArrayx.get(FileParserConstants.POSITION17);
                            mInput.put(filePositionModel.getVar17(),var17);
                            break;
                        case 18:
                            var18=mrowArrayx.get(FileParserConstants.POSITION18);
                            mInput.put(filePositionModel.getVar18(),var18);
                            break;
                        case 19:
                            var19=mrowArrayx.get(FileParserConstants.POSITION19);
                            mInput.put(filePositionModel.getVar19(),var19);
                            break;
                        case 20:
                            var20=mrowArrayx.get(FileParserConstants.POSITION20);
                            mInput.put(filePositionModel.getVar20(),var20);
                            break;
                        default:
                            logger.info("FileParserApp" + "CSV Position Not Set Correctly.  ");
                            break;

                    }
                }

                // 2.2. Get the template
                Template template = null;
                Writer outputWriter = null;
                try {
                    template = mCfg.getTemplate(mTemplateName);
                    // Write output to the console
                    outputWriter = new StringWriter();
                    template.process(mInput, outputWriter);
                } catch (IOException e) {
                    e.printStackTrace();
                    logger.error("IOException Occurred with Template",e);
                } catch (TemplateException e) {
                    logger.error("Unable to Find Template.  Exception Occurred.  ",e);
                   // e.printStackTrace();
                }
                logger.info("FreeMarker Output Below :\n"+outputWriter.toString());
            }
        });
    }

}
