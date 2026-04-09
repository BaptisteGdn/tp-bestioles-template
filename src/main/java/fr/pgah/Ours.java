package fr.pgah;

import java.awt.*;

public class Ours extends Bestiole {

  private boolean polaire;
  private boolean slash;

  public Ours(boolean polaire) {
    this.polaire = polaire;
    this.slash = true;
  }

  public Color getCouleur() {
    return polaire ? Color.WHITE : Color.BLACK;
  }

  public String toString() {
    String s = slash ? "/" : "\\";
    slash = !slash;
    return s;
  }

  public Action getAction(BestioleInfo info) {
    if (info.getEnFace() == Voisin.AUTRE) {
      return Action.INFECTER;
    } else if (info.getEnFace() == Voisin.RIEN) {
      return Action.SAUTER;
    } else {
      return Action.GAUCHE;
    }
  }
}