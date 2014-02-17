public class NodeImpl{
		public NodeImpl next;
		public int value;

		public NodeImpl(int v){
			this.value = v;
		}

		@Override
		public String toString() {
			return "[value=" + value + "]\n";
		}
		
	}