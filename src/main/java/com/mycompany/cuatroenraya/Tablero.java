/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.cuatroenraya;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;


public class Tablero extends Pane {

    
    public Tablero() {
        for(int i=0; i<8; i++){
            Line line = new Line(Ficha.TAM_FICHA*i, Ficha.TAM_FICHA, Ficha.TAM_FICHA*i, Ficha.TAM_FICHA*7);
            this.getChildren().add(line);
        }
    }
    
}