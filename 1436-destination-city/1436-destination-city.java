class Solution {
    public String destCity(List<List<String>> paths) {
          var sources = new HashSet<String>();
    var destination = new HashSet<String>();

    for (var path : paths) {
      sources.add(path.get(0));

      if (destination.contains(path.get(0)))
        destination.remove(path.get(0));

      if (!sources.contains(path.get(1)))
        destination.add(path.get(1));
    }
        return  destination.iterator().next();
    }
}