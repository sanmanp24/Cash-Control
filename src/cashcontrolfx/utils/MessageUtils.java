/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cashcontrolfx.utils;

import java.util.Optional;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.*;
import javafx.scene.control.ButtonType;


public class MessageUtils {
    
    
    public static void showError(String header, String message){
        
        Alert alert = new Alert( AlertType.ERROR );
        alert.setTitle( "Error Dialog" );
        alert.setHeaderText( header );
        alert.setContentText( message );

        alert.showAndWait();
        
    }
    
    
    public static void showMessage(String header, String message){
        
        Alert alert = new Alert( AlertType.INFORMATION );
        alert.setTitle( "Information Dialog" );
        alert.setHeaderText( header );
        alert.setContentText( message );

        alert.showAndWait();
        
    }
    
    
    public static boolean showConfirmMessage(String header, String message ){
        
        Alert alert = new Alert( AlertType.INFORMATION );
        alert.setTitle( "Confirmation Dialog" );
        alert.setHeaderText( header );
        alert.setContentText( message );
        alert.getButtonTypes().setAll( ButtonType.OK, ButtonType.CANCEL );
        Optional<ButtonType> result = alert.showAndWait();
        if (result.get() == ButtonType.OK){
            
            return true;
            
        } else {
            
            alert.close();
            return false;
            
        }
        
    }
    
}
