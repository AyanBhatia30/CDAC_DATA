#ifndef CLERK__H__
#define CLERK__H__
#include"emp.h"
class clerk:public emp {
	protected:
	int overtime;
	public:
		clerk();
		clerk(int,char *,float,int);
		~clerk();
	 	float cal_sal();
};
#endif
