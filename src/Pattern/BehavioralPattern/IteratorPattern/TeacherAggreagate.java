package Pattern.BehavioralPattern.IteratorPattern;

/***
 * 老师点名
 */
public class TeacherAggreagate implements Aggregate {
    String[] nameList = {"jack", "mark", "lee", "tao"};

    @Override
    public Iterator getIterator() {
        return new TaskIterator();
    }

    private class TaskIterator implements Iterator {
        int index = 0;

        @Override
        public boolean hasNext() {
            if (index < nameList.length) {
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return nameList[index++];
            }
            return null;
        }
    }



}