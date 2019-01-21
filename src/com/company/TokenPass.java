package com.company;

public class TokenPass {
    int pcount;
    int[] tokens;
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

    }

    public void distributeCurrentPlayerTokens() {

    }

    public void nextPlayer() {

    }
}
