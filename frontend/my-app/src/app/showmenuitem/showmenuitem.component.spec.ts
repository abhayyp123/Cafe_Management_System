import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowmenuitemComponent } from './showmenuitem.component';

describe('ShowmenuitemComponent', () => {
  let component: ShowmenuitemComponent;
  let fixture: ComponentFixture<ShowmenuitemComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ShowmenuitemComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ShowmenuitemComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
