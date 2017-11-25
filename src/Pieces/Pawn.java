package Pieces;

import Enumerators.Team;

public class Pawn extends Pieces {

    private String image;
    private final Team team;
    private final int value;

    public Pawn(Team team){
        this.value = 1;
        this.team = team;
        switch (team) {
            case WHITE:
                this.image = "Images/Chess_plt60.png";
                break;
            case BLACK:
                this.image = "Images/Chess_pdt60.png";
                break;
        }
    }
    @Override
    public void move() {

    }

    @Override
    public void take() {

    }

    @Override
    public int getValue() {
        return this.value;
    }

    @Override
    public int getX() {
        return 0;
    }

    @Override
    public int getY() {
        return 0;
    }

    @Override
    public Enum getColor() {
        return this.team;
    }

    @Override
    public String getImage() {
        return this.image;
    }
}
