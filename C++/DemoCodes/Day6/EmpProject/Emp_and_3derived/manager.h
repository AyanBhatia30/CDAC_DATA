#ifndef MANAGER__H__
#define MANAGER__H__
#include"emp.h"
class manager:public emp {
	protected:
	float bonus;
	
	public:
		manager();
		manager(int,char *,float,float);
		~manager();
		float cal_sal();
		void fun(); 
};
#endif
