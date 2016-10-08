package es.upm.miw.pd.visitor.figure;

public class VisitorArea extends Visitor {
	
	private double area;
	
	@Override
	public void visitCircle(Circle e) {
		this.area= this.area+ Math.PI * e.getRadius() * e.getRadius();
		
	}

	@Override
	public void visitSquare(Square e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTriangle(Triangle e) {
		// TODO Auto-generated method stub
		
	}

}
