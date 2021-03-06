package com.laibao.prospring5.chapter4.beandestruction;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.io.File;

/**
 * @author laibao wang
 * @date 2018-08-02
 * @version 1.0
 */
public class DestructionBeanWithJSR250 {
    private File file;
    private String filePath;

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @PostConstruct
    private void init() throws Exception{
        System.out.println("Initializing Bean");
        if (filePath == null) {
            throw new IllegalArgumentException("You must specify the filePath property of" + DestructionBean.class);
        }
        this.file = new File(filePath);
        this.file.createNewFile();
        System.out.println("File exists: " + file.exists());
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Destroying Bean");
        if(!file.delete()) {
            System.err.println("ERROR: failed to delete file.");
        }
        System.out.println("File exists: " + file.exists());
    }


}
