/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.p1gu.game.composant;

import com.artemis.Component;

/**
 *
 * @author Michael
 */
public class Dimension extends Component {

    public float largeur, hauteur;

    public Dimension(float largeur, float hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }
    
    
}
