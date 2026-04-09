package fr.pgah;

import java.awt.*;

public class ChatNinja extends Bestiole {

  public ChatNinja() {
  }

  public Color getCouleur() {
    return Color.MAGENTA;
  }

  public String toString() {
    return "N";
  }

  public Action getAction(BestioleInfo info) {
    if (info.getEnFace() == Voisin.AUTRE) {
      return Action.INFECTER;
    } else if (info.getEnFace() == Voisin.RIEN) {
      return Action.SAUTER;
    } else {
      return Action.DROITE;
    }
  }
}