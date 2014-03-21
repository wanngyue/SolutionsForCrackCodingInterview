import java.util.Scanner;


public class Solution {
	private Piece[][] board;
	Scanner in = new Scanner(System.in);
	public Solution(){
		board = new Piece[8][8];
		for(int i = 0; i < 8;++i){
			for(int j = 0;j < 8;++j){
				board[i][j] = Piece.UNKOW;
			}
		}
		board[3][3] = Piece.WHITE;
		board[4][3] = Piece.BLACK;
		board[3][4] = Piece.BLACK;
		board[4][4] = Piece.WHITE;

		printBoard();
	}
	public void game(){
		while(won() == Piece.UNKOW){
			while(true){
				try {
					step(Piece.BLACK);
					break;
				} catch (Exception e) {
					System.out.println("Invalid input black, plz try again");
				}
			}

			while(true){
				try {
					step(Piece.WHITE);
					break;
				} catch (Exception e) {
					System.out.println("Invalid input white, plz try again");
				}
			}
		}
		System.out.println(((won() == Piece.BLACK)?"Black ":"White ")+ "wins");
	}
	public Piece won(){
		if(!canGo(Piece.BLACK)&&!canGo(Piece.WHITE)){
			int count = 0;
			for(int i = 0; i < 8;++i){
				for(int j = 0;j < 8;++j){
					if(board[i][j] == Piece.BLACK){
						count++;
					}else if(board[i][j] == Piece.WHITE){
						count--;
					}
				}
			}
			if(count > 0){
				return Piece.BLACK;
			}
			if(count < 0){
				return Piece.WHITE;
			}
			return Piece.DRAW;
		}
		return Piece.UNKOW;
	}
	public boolean canGo(Piece piece){
		for(int i = 0; i < 8;++i){
			for(int j = 0;j < 8;++j){
				if(board[i][j] == piece){
					for(int x = 0;x < 8;++x){
						if(x != i){
							if(board[x][j] == Piece.UNKOW){
								return true;
							}
						}
					}
					for(int y = 0;y < 8;++y){
						if(y != j){
							if(board[i][y] == Piece.UNKOW){
								return true;
							}
						}
					}
				}
			}
		}
		return false;
	}

	public void step(Piece piece) throws Exception{

		int x = in.nextInt();
		int y = in.nextInt();

		if(validMove(piece, x, y)){
			changeBoard(piece, x, y);
		}else{
			throw new Exception();
		}
	}
	public boolean validMove(Piece piece, int x, int y){
		if(board[x][y] != Piece.UNKOW){
			return false;
		}
		for(int i = 0;i < 8;++i){
			if(i != x && board[i][y] == piece){
				int counter = 0;
				if(i < x - 1){
					for(int j = i + 1;j < x;++j){
						if(board[j][y] == inverse(piece)){
							counter++;
						}
					}
					if(counter == x - i - 1){
						return true;
					}
				}else{
					if(i > x + 1){
						for(int j = x + 1;j < i;++j){
							if(board[j][y] == inverse(piece)){
								counter++;
							}
						}
						if(counter == i - x - 1){
							return true;
						}

					}
				}
			}
		}
		for(int i = 0;i < 8;++i){
			if(i != y && board[x][i] == piece){
				int counter = 0;
				if(i < y - 1){
					for(int j = i + 1;j < y;++j){
						if(board[x][j] == inverse(piece)){
							counter++;
						}
					}
					if(counter == y - i - 1){
						return true;
					}
				}else{
					if(i > y + 1){
						for(int j = y + 1;j < i;++j){
							if(board[x][j] == inverse(piece)){
								counter++;
							}
						}
						if(counter == i - y - 1){
							return true;
						}

					}
				}

			}
		}
		return false;
	}
	public Piece inverse(Piece p){
		if(p == Piece.BLACK){
			return Piece.WHITE;
		}
		if(p == Piece.WHITE){
			return Piece.BLACK;
		}
		return Piece.UNKOW;
	}
	public void changeBoard(Piece piece, int x, int y){
		board[x][y] = piece;
		for(int i = 0;i < 8;++i){
			if(i !=x){
				if(board[i][y] == piece){
					if(i < x){
						for(int k = i; k < x;++k){
							board[k][y] = piece;
						}
					}else {
						for(int k = x + 1; k <= i;++k ){
							board[k][y] = piece;
						}
					}
				}
			}
		}
		for(int i = 0;i < 8;++i){
			if(i != y){
				if(board[x][i] == piece){
					if(i < y){
						for(int k = i; k < y;++k){
							board[x][k] = piece;
						}
					}else {
						for(int k = y + 1; k <= i;++k ){
							board[x][k] = piece;
						}
					}
				}
			}
		}
		printBoard();
	}
	public void printBoard(){
		for(int i = 0; i < 8;++i){
			for(int j = 0;j < 8;++j){
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
}
