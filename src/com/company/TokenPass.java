package com.company;

public class TokenPass {
    int pcount;
    int[] tokens;
    int crtplayer;
    public TokenPass(int playercount) {
        this.pcount = playercount;
    }

    public int gameOver() {
        for(int i = 0; i < pcount; i++)
        {
            if(tokens[i] == 0)
            {
                return i;
            }
        }
        return 0;
    }

    public void printBoard() {
        for(int i = 0; i < pcount; i++)
        {
            System.out.println("Player " + i + ": " + tokens[i] + " ");
        }
        System.out.println("Current Player: " + crtplayer);
    }

    public void distributeCurrentPlayerTokens()
    {

    }

    public void nextPlayer() {

    }
}
