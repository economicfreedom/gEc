package Chapter07;

//T=Tv, M=String
public class Product<T,M> {
	//T=Tv, M=String
	//3. new Tv()
	private T kind;

	//3.String model = "스마트TV"
	private M model;
	//T=Tv 가 리턴타입
	public T getKind() {
		return kind;
	}

	//M=String이 매개변수 타입
	public M getModel() {
		return model;
	}
	//M=String이 메소드의 리턴타입
	//1.String model = "스마트TV"
	public void setModel(M model) {
		this.model = model; 	//2.String model = "스마트TV"
	}

	//T=Tv가 매개변수의 타입
	//1.Tv kind = new Tv()
	public void setKind(T kind) {
		this.kind = kind; //2. new Tv()
	}
	
	
}
