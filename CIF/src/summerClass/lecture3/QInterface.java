package summerClass.lecture3;


public interface QInterface<ValType> {

	public void    addLast             ( ValType valType );
	public ValType removeFirst         (                 ) throws Exception;
	public boolean isReady             (                 );
	public boolean hasElementsToRemove (                 );
	
}
