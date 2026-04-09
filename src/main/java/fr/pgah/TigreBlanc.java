package fr.pgah;

import java.awt.*;

public class TigreBlanc extends Bestiole {

  private boolean aInfecte;
  private int compteur;

  public TigreBlanc() {
    aInfecte = false;
    compteur = 0;
  }

  public Color getCouleur() {
    return Color.WHITE;
  }

  public String toString() {
    return aInfecte ? "B" : "b";
  }

  public Action getAction(BestioleInfo info) {
    compteur++;

    if (info.getEnFace() == Voisin.AUTRE) {
      aInfecte = true;
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