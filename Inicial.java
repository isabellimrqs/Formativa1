package controller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Inicial extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        // Obieto que carrega o arauivo fxml
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/view/JFXCalculadora.fxml"));
        // Obieto AnchorPane (container utilizado no layout)
        // Controle (nó) raiz recebe a referência do arquivo fxml
        Pane nodeRoot = loader.load();
        // Criacao da cena recebendo o controle raiz
        Scene scene = new Scene(nodeRoot);
        // Atribuicão da cena no palco
        stage.setScene(scene);
        //Configuração da apresentação da tela no monitor
        stage.initStyle(StageStyle.UNDECORATED);//Retira barra superior da janela
        stage.setResizable(false);//Não permite redimensionar a janela
        stage.centerOnScreen();//Posiciona a janela no meio da tela
        // Apresenta o palco
        stage.show();
    }

    public static void main(String[] args){
        launch(args);
    }
}
