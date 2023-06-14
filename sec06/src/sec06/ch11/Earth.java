package sec06.ch11;

public class Earth {

	static final double EARTH_RADIUS = 6400;
	static final double EARTH_SURFACE_AREA;
	
	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
		
	}
}
//실행 클래스를 만들고 지구의 반지름은 000km, 지구의 표면적은 000km^
