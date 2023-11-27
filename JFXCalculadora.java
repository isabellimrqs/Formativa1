package controller;
import model.AreasGeometricas;
import model.AreasGeometricas.*;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class JFXCalculadora {
    public TextField txtFormaGeometrica;
    public TextField txtLargura;
    public TextField txtAltura;
    public TextField txtRaio;
    public TextField txtBase;
    public TextField txtDiagonalMaior;
    public TextField txtDiagonalMenor;
    public Button btnCalcular;

    public Button btnSair;
    public Label lblResultado;

    public void calcular(ActionEvent actionEvent) {

        String opcao = txtFormaGeometrica.getText().toLowerCase();
        AreasGeometricas area = new AreasGeometricas();

        switch(opcao){
            case "quadrado":
                lblResultado.setText("A área do quadrado é "+area.calcularAreaQuadrado(Double.parseDouble(txtLargura.getText())));
                break;
            case "retangulo":
                lblResultado.setText("A área do retangulo é "+area.calcularAreaRetangulo(Double.parseDouble(txtLargura.getText()),Double.parseDouble(txtAltura.getText())));
                break;
            case "triangulo":
                lblResultado.setText("A área do triangulo é "+area.calcularAreaTriangulo(Double.parseDouble(txtAltura.getText()),Double.parseDouble(txtBase.getText())));
                break;
            case "circulo":
                lblResultado.setText("A área do círculo é "+area.calcularAreaCirculo(Double.parseDouble(txtRaio.getText())));
                break;
            case "losango":
                lblResultado.setText("A área do losango é "+area.calcularAreaLonsago(Double.parseDouble(txtDiagonalMaior.getText()),Double.parseDouble(txtDiagonalMenor.getText())));
                break;
        }
    }

    public void sair(ActionEvent actionEvent) {
        System.exit(0);
    }
}
