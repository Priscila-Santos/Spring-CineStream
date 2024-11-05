import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';
import { HomeService } from '../../services/home.service';

import { RouterModule } from '@angular/router';
import { HomePageComponent } from '../../components/home-page/home-page.component';
import { CommonModule } from '@angular/common';

interface HomeForm {
  search: FormControl<string | null>;
}
@Component({
  selector: 'app-home',
  standalone: true,
  imports: [
    CommonModule,
    ReactiveFormsModule,
    HomePageComponent
  ],
  // providers: [
  //   HomeService
  // ],
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {
  homeForm!: FormGroup<HomeForm>;
  
  carouselItems = [
    { title: 'CineStream', subtitle: 'Subtitle 1' },
    { title: 'Movie 2', subtitle: 'Subtitle 2' },
    { title: 'Series 3', subtitle: 'Subtitle 3' },
  ];

  constructor(
    private router: Router,
    private fb: FormBuilder,
    private toastService: ToastrService,
    private homeService: HomeService
  ){
    this.homeForm = new FormGroup<HomeForm>({
      search: new FormControl('', [Validators.required])
    });
  }

  
  navigate(){
    this.router.navigate(["/another-page"]); // Ajuste a rota conforme necessário
  }

}
