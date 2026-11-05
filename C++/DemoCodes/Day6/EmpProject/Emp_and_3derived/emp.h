#ifndef EMP__H__      //#define pre-processor directive
#define EMP__H__
class emp {
	protected:
	int empno;
	char *name;
	float bsal;
	public:
		emp();
		emp(int,char *,float);
	    
        virtual float cal_sal();
        virtual ~emp();
        void fun();
        
};
#endif
