
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import EmpManager from "./grid/EmpGrid"
import EmpDetail from "./components/listers/EmpDetail"
import RankManager from "./grid/RankGrid"
import RankDetail from "./components/listers/RankDetail"
import DeptManager from "./grid/DeptGrid"
import DeptDetail from "./components/listers/DeptDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/emps',
                name: 'EmpManager',
                component: EmpManager
            },
            {
                path: '/emps/:id',
                name: 'EmpDetail',
                component: EmpDetail
            },
            {
                path: '/ranks',
                name: 'RankManager',
                component: RankManager
            },
            {
                path: '/ranks/:id',
                name: 'RankDetail',
                component: RankDetail
            },
            {
                path: '/depts',
                name: 'DeptManager',
                component: DeptManager
            },
            {
                path: '/depts/:id',
                name: 'DeptDetail',
                component: DeptDetail
            },



    ]
})
