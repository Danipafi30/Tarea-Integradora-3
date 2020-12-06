package model;

public class LineUp {
	
	public final static int LINEUP_ROWS = 10;
	public final static int LINEUP_COLUMNS = 7;
	
	private String date;
	private int tactic;
	private int[][] matrix;
	
	public LineUp(String chain, String date) {
		this.date = date;
		matrix = stringToMatrix(chain);
	}
	
	public int[][] stringToMatrix(String chain){
		int[][] matrix = new int[LINEUP_ROWS][LINEUP_COLUMNS];
		String[] positions = chain.split("-");
		int[] positionsmod = new int[positions.length];
		for(int i=0; i<positions.length; i++) {
			positionsmod[i] = Integer.parseInt(positions[i]);
		}
		int numpositions = positions.length;
		
		if(numpositions == 2) {
			for(int i=9; i<matrix.length; i++) {
				for(int j=0; j<matrix[i].length; j++) {
					
				}
			}
		}
		/* 0 0 0 0 0 0 0
		 * 0 0 1 0 1 0 0
		 * 0 0 0 0 0 0 0
		 * 0 0 0 0 0 0 0
		 * 1 0 1 0 1 0 1
		 * 0 0 0 0 0 0 0
		 * 0 0 0 0 0 0 0
		 * 1 0 1 0 1 0 1
		 * 0 0 0 0 0 0 0
		 * 0 0 0 0 0 0 0
		 */
		return matrix;
		
		
		
	
	}
	
	
}
