package greencode.ir.blankproject.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.util.Log;
import android.webkit.MimeTypeMap;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


/**
 * Created by alireza on 5/23/2017.
 */

public class FileManager {
    /*public File makeFile(String type){
        if(type.equals("profile")){
            if(!Constants.ProfileDir.exists()){
                Constants.ProfileDir.mkdir();
            }
            return Constants.ProfileDir;
        }
        if(type.equals("photo")){
            if(!Constants.ImagesDir.exists()){
                Constants.ImagesDir.mkdirs();
            }
            return Constants.ImagesDir;
        }else if(type.equals("voice")){
            if(!Constants.MusicDir.exists()){
                Constants.MusicDir.mkdirs();
            }
            return Constants.MusicDir;
        }else if(type.equals("video")){
            if(!Constants.VideoDir.exists()){
                Constants.VideoDir.mkdirs();
            }
            return Constants.VideoDir;
        }else if(type.equals("audio")){
            if(!Constants.MusicDir.exists()){
                Constants.MusicDir.mkdirs();
            }
            return Constants.MusicDir;
        }else if(type.equals("temp")){
            if(!Constants.Temp.exists()){
                Constants.Temp.mkdirs();
            }
            return Constants.Temp;
        }
        else {
            if(!Constants.Documents.exists()){
                Constants.Documents.mkdirs();
            }
            return Constants.Documents;
        }


    }


    public  boolean isExist(String filePath,String type){
        File file = new File(makeFile(type).toString()+"/"+filePath);
        boolean a = file.exists();
        if(a){
            return true;
        }
        else if(file.getAbsoluteFile().exists()) {
        return true;
        }
        else {
            return false;
        }
    }
    public int fileSize(String filePath,String type){
        File file = new File(makeFile(type).toString()+"/"+filePath);
        if(file.exists()){
         return (int) file.length();
        }else {
            return 0;
        }
    }
    public void copy(File src, File dst) throws IOException {
        InputStream in = new FileInputStream(src);
        OutputStream out = new FileOutputStream(dst);

        // Transfer bytes from in to out
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }
        in.close();
        out.close();
    }

    public static boolean isSaved(String localAddress, String type) {
        final FileManager fileManager = new FileManager();


        if (fileManager.isExist(localAddress, type)) {
            return true;
        } else {
            return false;
        }
    }

    public static byte[] convertFileToByte(File file) throws IOException {
//init array with file length
        byte[] bytesArray = new byte[(int) file.length()];

        FileInputStream fis = new FileInputStream(file);
        fis.read(bytesArray); //read file into bytes[]
        fis.close();

        return bytesArray;
    }
    public static boolean isExistComplitly(String localAddress, int filesize, String type) {
        final FileManager fileManager = new FileManager();


        if (fileManager.isExist(localAddress, type)) {

            Log.d("videoCheck","local address = "+localAddress+"\nfile size in db  =  "+filesize +" and file size in local is "+ fileManager.fileSize(localAddress, type));
            if (fileManager.fileSize(localAddress, type) >= filesize) {

                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
    public static boolean isExistPartialy(String localAddress,String type){
        final FileManager fileManager = new FileManager();


        if (fileManager.isExist(localAddress, type)) {
            return true;
        }else {
            return false;
        }
    }

    public static boolean checkWriteExternalPermission(Context context) {

        String permission = "android.permission.WRITE_EXTERNAL_STORAGE";
        int res = context.checkCallingOrSelfPermission(permission);
        return (res == PackageManager.PERMISSION_GRANTED);
    }

    public static boolean checkReadExternalPermission(Context context) {

        String permission = "android.permission.READ_EXTERNAL_STORAGE";
        int res = context.checkCallingOrSelfPermission(permission);
        return (res == PackageManager.PERMISSION_GRANTED);
    }

    public static Bitmap resizeBitmap(final Bitmap temp, final int size) {
        if (size > 0) {
            int width = temp.getWidth();
            int height = temp.getHeight();
            float ratioBitmap = (float) width / (float) height;
            int finalWidth = size;
            int finalHeight = size;
            if (ratioBitmap < 1) {
                finalWidth = (int) ((float) size * ratioBitmap);
            } else {
                finalHeight = (int) ((float) size / ratioBitmap);
            }
            return Bitmap.createScaledBitmap(temp, finalWidth, finalHeight, true);
        } else {
            return temp;
        }
    }
    public static String fileType(String path){
        String type = "";
        String extension = MimeTypeMap.getFileExtensionFromUrl(path);
        Log.d("hiLevel","extention="+extension);
        if (extension != null) {
            if(extension.equals("")){

                type = path.substring(path.lastIndexOf(".")+1);
                Log.d("hiLevel","extention="+type);

                return type;
            }else {
                return "." + extension;
            }
        }
        return type;
    }
    public static String fileName(String path){
        String fileName = path.substring(path.lastIndexOf("/") + 1);
        return fileName;
    }*/
}
