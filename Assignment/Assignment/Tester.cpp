
#include<iostream>
using namespace std;
#include "Line.h";

int main()
{
	Line line;
	Line line2;
	line.setLine(0.0, 0.0, 0.0, 0.0);
	line2.setLine(0.0, 0.0, 3.0, 0.0);
	cout << "Distance of line = " << line2.distance() << endl;

	line << line2;
	line << line;

	line.setPoint1(2.0,4.0);
	line.setPoint2(4.0, 2.0);
	
	line2.setPoint1(3.0, 6.0);
	line2.setPoint2(5.0, 7.0);

	cout << "updated coordinates" << endl;

	line << line2;
	line << line;

	cout << "Distance of line = " << line.distance() << endl;
	cout << "Distance of line2 = " << line2.distance() << endl;

	cout << "slope of line= " << line.slope() << endl;
	cout << "slope of line2= " << line.slope() << endl;

	bool value = line != line2;
	bool value1 = line == line2;
	//line << line2;
	//line >> line2;

	
	
	cout << "line Equals to line2? "<<value<<endl;
	cout << "line Not Equals to line2 ? "<<value1<<endl;

	cout << "Enter line values" << endl;
	line >> line;
	line << line;

	cout << "Enter line2 values" << endl;
	line2 >> line2;
	line2 << line2;
		
	//cout <<line<<endl;
	//cin >> line2;
	//cout << line2;
	system("pause");
	return 0;
}