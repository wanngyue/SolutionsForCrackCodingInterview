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

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((next == null) ? 0 : next.hashCode());
			result = prime * result + value;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			NodeImpl other = (NodeImpl) obj;
			if (next == null) {
				if (other.next != null)
					return false;
			} else if (!next.equals(other.next))
				return false;
			if (value != other.value)
				return false;
			return true;
		}
		
		
	}