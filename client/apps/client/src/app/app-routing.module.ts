import { NgModule } from '@angular/core';
import { Route, RouterModule } from '@angular/router';

const routes: Route[] = [
    {
        path: 'context-a',
        loadChildren: () => import('@client/context-a').then(m => m.ContextAModule)
    },
    {
        path: 'context-b',
        loadChildren: () => import('@client/context-b').then(m => m.ContextBModule)
    }
];

@NgModule({
    imports: [
        RouterModule.forRoot(routes, { relativeLinkResolution: 'legacy' }),
    ],
    exports: [RouterModule],
})
export class AppRoutingModule { }
