import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class app {

	public static void main(String[] args) {

		// 1 & 4
		List<String> employeeNames = new ArrayList<String>();
		employeeNames.add("Megan");
		employeeNames.add("Sally");
		employeeNames.add("Bob");
		employeeNames.add("Peter");
		employeeNames.add("Pat");
		// 2 & 4
		Set<Integer> ids = new HashSet<Integer>();
		ids.add(147);
		ids.add(582);
		ids.add(183);
		ids.add(834);
		ids.add(447);
		// 3
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		// 5
		int i = 0;
		for (Integer id : ids) {
			employeeMap.put(id, employeeNames.get(i));
			i++;
		}
		// 6
		for (Integer key : ids) {
			System.out.println(key + " " + employeeMap.get(key));
		}
		// 7
		StringBuilder idsBuilder = new StringBuilder();
		// 8
		for (Integer id : ids) {
			idsBuilder.append(id + "-");
		}
		// 9
		System.out.println(idsBuilder.toString());
		// 10
		StringBuilder namesBuilder = new StringBuilder();
		// 11
		for (String employee : employeeNames) {
			namesBuilder.append(employee + " ");
		}
		// 12
		System.out.println(namesBuilder.toString());
	}
}
