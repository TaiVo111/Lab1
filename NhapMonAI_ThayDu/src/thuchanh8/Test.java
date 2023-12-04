package thuchanh8;

public class Test {
	public static void main(String[] args) {
			Node A = new Node("A");
			Node B = new Node("B");
			Node C = new Node("C");
			Node D = new Node("D");
			Node E = new Node("E");
			Node F = new Node("F");
			Node G = new Node("G",-5);
			Node N = new Node("N",4);
			Node O = new Node("O");
			Node W = new Node("W",-3);
			Node X = new Node("X",-5);
			Node H = new Node("H",3);
			Node I = new Node("I",8);
			Node J = new Node("J");
			Node P = new Node("P",9);
			Node Q = new Node("Q",-6);
			Node R = new Node("R",0);
			Node K = new Node("K");
			Node L = new Node("L",2);
			Node M = new Node("M");
			Node S = new Node("S",3);
			Node T = new Node("T",5);
			Node U = new Node("U",-7);
			Node V = new Node("V",-9);
			
			A.addChild(B);
			A.addChild(C);
			A.addChild(D);
			A.addChild(E);
			
			B.addChild(F);
			B.addChild(G);
			
			F.addChild(N);
			F.addChild(O);
			
			O.addChild(W);
			O.addChild(X);
			
			C.addChild(H);
			C.addChild(I);
			C.addChild(J);
			
			J.addChild(P);
			J.addChild(Q);
			J.addChild(R);
			
			E.addChild(K);
			E.addChild(L);
			E.addChild(M);
			
			K.addChild(S);
			K.addChild(T);
			
			M.addChild(U);
			M.addChild(V);
			
			AlphaBetaSearchAlgo a1 = new AlphaBetaSearchAlgo();
			a1.execute(A);
	}
}
