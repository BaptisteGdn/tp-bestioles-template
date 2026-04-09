package fr.pgah;

import java.awt.*;

public class Yeti extends Bestiole {

  private int compteur;

  public Yeti() {
    compteur = 0;
  }

  public Color getCouleur() {
    return Color.GRAY;
  }

  public String toString() {
    String[] lettres = {"Y", "E", "T", "I"};
    return lettres[(compteur / 6) % 4];
  }

  public Action getAction(BestioleInfo info) {
    compteur++;

    if (info.getEnFace() == Voisin.AUTRE) {
      return Action.INFECTER;
    } else if (info.getEnFace() == Voisin.RIEN) {
      return Action.SAUTER;
    } else {
      return Action.DROITE;
    }
  }
}