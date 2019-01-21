package com.company;

public class TokenPass {
    int pcount;
    int[] tokenboard;
    int crtplayer;

    public TokenPass(int playercount) {
        this.pcount = playercount;
        tokenboard = new int[playercount];
        for(int i = 0; i < pcount - 1; i++)
        {
            tokenboard[i] = (int)(Math.random()*11)+1;
        }
        crtplayer = 0;
    }

    public int gameOver() {
        for(int i = 0; i < pcount; i++)
        {
            if(tokenboard[i] == 0)
            {
                return i;
            }
        }
        return -1;
    }

    public void printBoard() {
        for(int i = 0; i < pcount; i++)
        {
            System.out.println("Player " + i + ": " + tokenboard[i] + " ");
        }
        System.out.println("Current Player: " + crtplayer);
    }

    public void distributeCurrentPlayerTokens()
    {
        int playerstokens = tokenboard[crtplayer];
        for(int i = crtplayer; playerstokens != 0; i++)
        {
            tokenboard[i]++;
            playerstokens--;
        }
    }

    public void nextPlayer()
    {
        if(crtplayer == pcount)
        {
            crtplayer = 0;
        }
        crtplayer++;
    }
}
