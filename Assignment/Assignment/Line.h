#pragma once
#include "Point.h"
#include<iostream>
using namespace std;
class Line
{
public:
	Point p1;
	Point p2;
	
	Line(const Line &obj);
	Line();


	void setLine(double x1, double y1, double x2, double y2);

	void setPoint1(double x1, double y1);

	void setPoint2(double x2, double y2);

	double distance();

	double slope();
	

	
	bool operator ==(const Line& line);
	

	bool operator !=(const Line& line);
	

	
	/*friend ostream &operator<<(ostream &output, Line &line) {
		output << "((" << line.p1.getX() << "," << line.p1.getY() << ") (" << line.p2.getX() << "," << line.p2.getY() << "))";//((x1,y1) (x2,y2))
		return output;
	}
	friend istream &operator>>(istream &input, Line &line) {
		
		input >> line.p1.getX() >> line.p1.getY() >> line.p2.getX() >> line.p2.getY();

		return input;}*/

	


	

	ostream &operator << (Line  &line)
	{
		return cout << "((" << line.p1.getX() << "," << line.p1.getY() << ") (" << line.p2.getX() << "," << line.p2.getY() << "))" << endl;
	}

	Line &operator >> (Line &line)
	{
		double temp1, temp2, temp3, temp4;
		cin >> temp1 >> temp2 >> temp3 >> temp4;
		line.p1.setX(temp1);
		line.p1.setY(temp2);
		line.p2.setX(temp3);
		line.p2.setY(temp4);
		return line;

	}



	
	

	
	

private:
	int *ptr;
};








