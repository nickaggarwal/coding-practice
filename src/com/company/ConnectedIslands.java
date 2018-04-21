package com.company;

public class ConnectedIslands {

    public static void main(String[] args) {
        // write your code here
        int[][] a=  { {1, 0, 1},
                      {1, 0, 0},
                      {1, 1, 1} };
        System.out.println(noOfConnected(a));
    }

    static int[] mov_x = {0, 0, 1, -1} ;
    static int[] mov_y = {1, -1, 0, 0} ;

    public static int noOfConnected(int[][] s) {

        int n = s.length ;
        int m = s[0].length ;

        int[][] visited = new int[3][3] ;
        int count = 0 ;
        for(int i=0; i < n ; i++) {
            for(int j=0; j < m ; j++) {
                if( visited[i][j] == 0 && s[i][j] == 1) {
                    dfs(s, visited, i , j);
                    count++ ;
                }
            }
        }

        return count;
    }

    public static boolean inRange(int val , int start , int end )
    {
        if( start <= val  && val < end )
            return true;
        return false;
    }

    public static void dfs(int[][] a , int[][] visited, int x,int y )
    {
        if(visited[x][y] == 1)
            return;

        visited[x][y] = 1 ;
        for(int i=0; i<4 ; i++ )
        {
            if(inRange(x+mov_x[i], 0, a.length ) && inRange(y+mov_y[i], 0 , a[0].length) )
            {
                if(visited[x+mov_x[i]][y+mov_y[i]] == 0 && a[x+mov_x[i]][y+mov_y[i]] == 1 )
                    dfs(a, visited, x+mov_x[i], y+mov_y[i]);
            }
        }

        return;
    }




}

