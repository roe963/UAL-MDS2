import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import './vista-encargadosdecompras.js';
import './vista-empresasdetransportes.js';

class VistaAdministrarempleados extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
<vaadin-vertical-layout theme="spacing" id="layout-menu"></vaadin-vertical-layout>
<vaadin-vertical-layout style="width: 100%; align-items: center;">
 <h3 style="margin-left: var(--lumo-space-xl);">Administrar empleados</h3>
</vaadin-vertical-layout>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; justify-content: space-between;">
 <vaadin-vertical-layout id="layout-anadirUsuario" style="flex-grow: 0; width: 40%; height: 80%; margin: var(--lumo-space-s); border: 1px solid black; align-items: stretch; flex-shrink: 1;"></vaadin-vertical-layout>
 <vaadin-vertical-layout style="width: 60%; flex-grow: 0; height: 80%; border: 1px solid black; align-items: stretch; flex-shrink: 1; margin: var(--lumo-space-s);">
  <vaadin-horizontal-layout style="height: 100%; width: 100%; flex-shrink: 1; padding: var(--lumo-space-m); justify-content: space-around;">
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; align-items: stretch; width: 45%; height: 100%;">
    <h4 style="align-self: center;">Encargado de compras</h4>
    <vaadin-vertical-layout id="layout-encargadoCompras" style="flex-shrink: 1; width: 100%; align-self: stretch; flex-grow: 0; align-items: stretch;">
     <vista-encargadosdecompras style="flex-shrink: 0;"></vista-encargadosdecompras>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout theme="spacing" style="flex-grow: 0; align-items: stretch; width: 45%; height: 100%;">
    <h4 style="align-self: center;">Empresa de transportes</h4>
    <vaadin-vertical-layout id="layout-empresaTransportes" style="align-self: stretch; align-items: stretch;">
     <vista-empresasdetransportes style="flex-shrink: 0;"></vista-empresasdetransportes>
    </vaadin-vertical-layout>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <vaadin-button id="button-guardar" style="align-self: stretch; margin: var(--lumo-space-s);">
    Guardar 
  </vaadin-button>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-administrarempleados';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaAdministrarempleados.is, VistaAdministrarempleados);
