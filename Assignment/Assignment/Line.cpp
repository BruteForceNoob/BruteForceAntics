#include "Line.h"



Line::Line()
{
	this->p1.setX(0.0);
	this->p1.setY(0.0);
	this->p2.setX(0.0);
	this->p2.setY(0.0);
}



Line::Line(const Line &obj) {

	ptr = new int;
	*ptr = *obj.ptr; // copy the value
}

void Line:: setLine(double x1, double y1, double x2, double y2)
{
	p1.setX(x1);
	p1.setY(y1);
	p2.setX(x2);
	p2.setY(y2);
}

void Line:: setPoint1(double x1, double y1)
{
	p1.setX(x1);
	p1.setY(y1);
}

void Line :: setPoint2(double x2, double y2)
{
	p2.setX(x2);
	p2.setY(y2);
}

double Line :: distance()
{
	return sqrt(pow(p2.getX() - p1.getX(), 2) - pow(p2.getY() - p1.getY(), 2));
}

double Line :: slope()
{
	if ((p2.getX() - p1.getX()) == 0)
	{
		cout << "infinity";
		return -0.0;
	}

	return (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());

}

bool Line :: operator ==(const Line& line)
{
	cout << "overloading" << endl;
	return (this->p1.getX() == line.p1.getX() && this->p1.getY() == line.p1.getY()) && (this->p2.getX() == line.p2.getX() && this->p2.getY() == line.p2.getY());
}

bool Line :: operator !=(const Line& line)
{
	return (this->p1.getX() != line.p1.getX() || this->p1.getY() != line.p1.getY()) || (this->p2.getX() != line.p2.getX() || this->p2.getY() != line.p2.getY());
}







