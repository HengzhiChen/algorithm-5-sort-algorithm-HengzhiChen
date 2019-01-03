public class SortAlgorithm{
  public static void mergeSort(int[] ints,int leftStart,int rightEnd) {
		if(leftStart == rightEnd) {
			return;
		}
		int leftEnd = (rightEnd-leftStart)/2+leftStart;
		mergeSort(ints,leftStart,leftEnd);
		mergeSort(ints,leftEnd+1,rightEnd);
		merge(ints,leftStart,leftEnd,rightEnd);
	}
    public static void merge(int[] ints, int leftStart, int leftEnd, int rightEnd) {
    	  int[] tmp = new int[rightEnd-leftStart+1];
    	  int l = leftStart;
    	  int r = leftEnd+1;
    	  int index = 0;
    	  while(l<=leftEnd && r<=rightEnd) {
    		  if(ints[l]<ints[r]){
    			  tmp[index] = ints[l];
    			  index++;
    			  l++;
    		  }
    		 else if(ints[l]>=ints[r]) {
    			  tmp[index] = ints[r];
    			  index++;
    			  r++;
    		  }
    	  }
    	  while(l<=leftEnd) {
    		  tmp[index] = ints[l];
    		  index++;
    		  l++;
    	  }
    	  while(r<=rightEnd) {
    		  tmp[index] = ints[r];
    		  index++;
    		  r++;
    	  }
    	  for(int i = 0;i<tmp.length;i++) {
    		  ints[leftStart+i] = tmp[i];
    	  }
      }
    public static void print(int[] ints) {
    	for (int e: ints) {
    		System.out.print(e+",");
    	}
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] ints = {3,1,-1,5};
        //            0 1  2 3
        mergeSort(ints,0,3);
        print(ints);
	}

}

  
  
int b = a[0];
    for( int i = 0;i<a.length-1;i++){
        if(a[i+1] > a[i]){
          b = a[i+1];
        }
    }
    int[] c = new Integar(b.length+1);   456456
    for( int i = 0;i<a.length;i++){
        int f = a[i];
        c[f] += 1;
    }
    for(int i = 0;i<a.length;i++){
        if(c[i]!=0){
          System.out.print(i);
        }
      
    
    while(b < a.length){
        for( int i = 0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
                int tmp = a[i];
                a[i] = a[i+1];
                a[i+1]=tmp;
            }
         }
      b++;
     }
     for(int i = 0;i<a.length;i++){
         System.out.print(a[i]);
}
