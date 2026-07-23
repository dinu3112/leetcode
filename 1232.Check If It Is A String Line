class Solution {
    public boolean checkStraightLine(int[][] Coordinates) {
       if (Coordinates.length<=2) {
        return true;
        }
       int x1 = Coordinates[0][0];
       int y1 = Coordinates[0][1];
       int x2 = Coordinates[1][0];
       int y2 = Coordinates[1][1];
       int dx = x2-x1;
       int dy = y2-y1;
       for(int i = 2 ;i < Coordinates.length;i++) {
       int x = Coordinates[i][0];
       int y = Coordinates[i][1];
       if((x-x1)*dy !=(y-y1)*dx) {
        return false;
            }
       }
       return true;
    }
}
