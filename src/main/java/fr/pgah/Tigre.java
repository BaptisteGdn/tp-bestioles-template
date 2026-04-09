package fr.pgah;

import java.awt.*;
import java.util.Random;

public class Tigre extends Bestiole {

  private int compteur;
  private Color couleur;
  private Random random;

  public Tigre() {
    random = new Random();
    compteur = 0;
    couleur = couleurAleatoire();
  }

  private Color couleurAleatoire() {
    Color[] couleurs = {Color.RED, Color.GREEN, Color.BLUE};
    return couleurs[random.nextInt(3)];
  }

  public Color getCouleur() {
    return couleur;
  }

  public String toString() {
    return "G";
  }

  public Action getAction(BestioleInfo info) {
    compteur++;
    if (compteur % 3 == 0) {
      couleur = couleurAleatoire();
    }

    if (info.getEnFace() == Voisin.AUTRE) {
      return Action.INFECTER;
    } else if (info.getEnFace() == Voisin.MUR || info.getADroite() == Voisin.MUR) {
      return Action.GAUCHE;
    } else if (info.getEnFace() == Voisin.MEME) {
      return Action.DROITE;
    } else {
      return Action.SAUTER;
    }
  }
}