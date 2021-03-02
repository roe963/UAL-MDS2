import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';

/**
 * `vista-ofertasadministrador`
 *
 * VistaOfertasadministrador element.
 *
 * @customElement
 * @polymer
 */
class VistaOfertasadministrador extends PolymerElement {

    static get template() {
        return html`
            <style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
                }
            </style>
        `;
    }

    static get is() {
        return 'vista-ofertasadministrador';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaOfertasadministrador.is, VistaOfertasadministrador);
